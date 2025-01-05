package com.angela.dicegameangela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angela.dicegameangela.ui.theme.DiceGameAngelaTheme
import com.angelasaez.diceandroidangela.model.Dice

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DiceGameAngelaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Content(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Content(modifier: Modifier = Modifier) {

    var dicePoints by rememberSaveable { mutableIntStateOf(2) }
    var startGame by rememberSaveable { mutableStateOf(false) }

    //tirada actual y siguiente (comparar)
    var diceThrowed by rememberSaveable { mutableIntStateOf(0) }
    var nextdiceThrowed by rememberSaveable { mutableIntStateOf(0) }

    //mensaje que informa al usuario si pierde o gana puntos (con un boolean que los va cambiando)
    var messageDice by rememberSaveable { mutableStateOf("") }
    var showMessage by rememberSaveable { mutableStateOf(false) }

    //Mensaje que se cambiará para simular lanzamiento de dado
    val context = LocalContext.current
    val messageStr1 = stringResource(R.string.throwing_message)
    var messageDiceThrowing by rememberSaveable { mutableStateOf(messageStr1) }

    //Activador/Desactivador botones
    var buttonsEnabled by rememberSaveable { mutableStateOf(true) }

    //Colores (xml) - en variables para reutilizarlos
    val colorButtons = colorResource(id = R.color.color_buttons)
    val colorButtons2 = colorResource(id = R.color.color_buttons2)
    val colorButtonsDisabled = colorResource(id = R.color.color_buttons_disabled)
    val colorTxt1 = colorResource(id = R.color.default_text) //Negro
    val colorTxt2 = colorResource(id = R.color.default_text2) //Blanco
    val gradientColors = Brush.verticalGradient(
        colors = listOf(
            colorResource(id = R.color.gradient_start), colorResource(id = R.color.gradient_end)
        )
    )

    //OBJETO DADO
    val dice = Dice() // 6 caras por defecto

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(gradientColors)
            .then(modifier),
    ) {
        Spacer(modifier = Modifier.height(5.dp))
        //FILA - TITULO JUEGO
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Absolute.Center
        ) {
            Text(
                text = stringResource(R.string.tittle_game),
                fontSize = dimensionResource(id = R.dimen.fontsize_big).value.sp,
                color = colorTxt1
            )
        }
        //FIN FILA TITULO JUEGO

        //FILA DESCRIPCIÓN
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .border(1.dp, Color.Black)
                .padding(8.dp), horizontalArrangement = Arrangement.Absolute.Center
        ) {
            Text(
                text = stringResource(R.string.description_game), fontSize = 15.sp
            )
        } //FIN FILA DESCRIPCIÓN

        //COLUMNA JUEGO
        if (startGame) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                //FILA PUNTOS
                Row(
                    //organizacion horizontal
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.End,
                ) {
                    //Dice points se acaban = Nueva fila
                    if (dicePoints == 0) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Button(
                                //Boton reiniciar
                                onClick = {
                                    startGame = false
                                    dicePoints = 20
                                    diceThrowed = 0
                                    dice.reset() // uso objeto dice para resetear dado
                                    messageDice = ""
                                },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = colorResource(id = R.color.button_restartstart_background),
                                    contentColor = colorTxt2
                                ),
                                shape = CircleShape,
                                modifier = Modifier
                                    .border(1.dp, Color.White, CircleShape)
                                    .shadow(2.dp, CircleShape)
                            ) {
                                Text(
                                    text = stringResource(R.string.reset_game),
                                    fontSize = dimensionResource(id = R.dimen.fontsize_medium).value.sp,
                                    modifier = Modifier.padding(5.dp),
                                )
                            }
                        }
                    } //Fin del IF points == 0

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        horizontalAlignment = Alignment.End,
                    ) {
                        //Si dice points son mayores a 0 aparecerá el cuadradito de los puntos
                        if (dicePoints > 0) {
                            //FILA PUNTOS
                            Row(
                                modifier = Modifier
                                    .border(1.dp, Color.Black)
                                    .padding(10.dp)
                            ) {
                                Text(
                                    text = "$dicePoints pts",
                                    fontSize = dimensionResource(id = R.dimen.fontsize_medium).value.sp,
                                    color = colorResource(id = R.color.points_text)
                                )
                            }
                        }
                    }
                } //FIN FILA PUNTOS
            }
            if (dicePoints > 0) {
                //Fila para el dice Throwing...
                Row(
                    modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = messageDiceThrowing,
                        fontSize = 15.sp,
                    )
                }
            }

            //FILA DADO
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                //Si se nos acban Dice Points ==
                //Dado se sustituirá por GAME OVER
                if (dicePoints <= 0) {
                    Text(
                        fontSize = dimensionResource(id = R.dimen.fontsize_medium).value.sp,
                        modifier = Modifier
                            .border(
                                width = 2.dp,
                                color = Color.Black,
                            )
                            .padding(50.dp),
                        text = stringResource(R.string.game_over),
                        color = colorResource(id = R.color.game_over_text)
                    )
                } else {
                    //DADO
                    Row(
                        modifier = Modifier
                            .border(2.dp, Color.Black)
                            .shadow(2.dp)
                            .padding(60.dp)
                            .width(50.dp), horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "$diceThrowed", fontSize = 30.sp, textAlign = TextAlign.Center
                        )
                    }
                }
            }
            //Fin fila dado
            Spacer(modifier = Modifier.height(10.dp))
            //FILA INFORMACIÓN USUARIO (gana/pierde puntos)
            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    //El contenido del messageDice lo configurarán nuestros botones.
                    text = messageDice,
                    fontSize = dimensionResource(id = R.dimen.fontsize_small).value.sp,
                )
            }
            //Fin fila info usuario
            Spacer(modifier = Modifier.height(10.dp))

            //LOS BOTONES APARECERAN SOLO SI TENEMOS PUNTOS
            if (dicePoints > 0) {
                //FILA - BOTONES NUMEROS DEL 1 AL 6
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    horizontalArrangement = Arrangement.Absolute.Center
                ) {
                    //He hecho bucles para las 2 filas para ahorrar codigo
                    for (i in 1..4) {
                        Button(
                            onClick = {
                                //Se quitan puntos y desactivamos botones mientras
                                dicePoints -= 3
                                buttonsEnabled = false
                                //Se lanza el dado (mensaje lanzamiento)
                                messageDiceThrowing = messageStr1
                                Thread {
                                    Thread.sleep(1000L)
                                    nextdiceThrowed = dice.throwDice() //Se tira dado
                                    messageDiceThrowing = "" //se quita mensaje lanzamiento dado
                                    // INFORMACION USUARIO
                                    //Si te quedas sin puntos... un mensaje
                                    if (dicePoints <= 0) {
                                        dicePoints = 0
                                        messageDice = context.getString(R.string.no_points_message)
                                        showMessage = true
                                    }
                                    //Si aun te quedan puntos... 2 mensajes
                                    else {
                                        //Se compara
                                        //si ganas - numeros iguales - 1 mensaje + puntos
                                        if (nextdiceThrowed == i) {
                                            dicePoints += 15
                                            messageDice =
                                                context.getString(R.string.win_guess_message)
                                        }
                                        //si pierdes - 1 mensaje
                                        else {
                                            messageDice =
                                                context.getString(R.string.lost_guess_message)
                                        }
                                        //Se quita el mensaje de información
                                        showMessage = true
                                    }
                                    //Se vuelven a activar los botones
                                    buttonsEnabled = true
                                    diceThrowed = nextdiceThrowed //Lo vemos
                                }.start()
                            },
                            enabled = dicePoints > 0 && buttonsEnabled, //habilitación boton general (mas de 0 puntos y tiempo espera)
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorButtons,
                                contentColor = colorTxt2,
                                disabledContainerColor = colorButtonsDisabled,
                            ),
                            shape = CircleShape,
                            modifier = Modifier
                                .shadow(4.dp, CircleShape)
                                .border(1.dp, Color.White, CircleShape)
                        ) {
                            Text(
                                text = "$i",
                                fontSize = dimensionResource(id = R.dimen.fontsize_medium).value.sp,
                                modifier = Modifier.padding(2.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(5.dp))
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Absolute.Center
                ) {
                    for (i in 5..6) {
                        //Misma estructura anterior
                        Button(
                            onClick = {
                                dicePoints -= 3
                                buttonsEnabled = false
                                messageDiceThrowing = messageStr1
                                Thread {
                                    Thread.sleep(1000L)
                                    nextdiceThrowed = dice.throwDice() //Se tira dado
                                    messageDiceThrowing = ""
                                    if (dicePoints <= 0) {
                                        dicePoints = 0
                                        messageDice = context.getString(R.string.no_points_message)
                                        showMessage = true
                                    } else {
                                        //Se compara
                                        if (nextdiceThrowed == i) {
                                            dicePoints += 15
                                            messageDice =
                                                context.getString(R.string.win_guess_message)
                                        } else {
                                            messageDice =
                                                context.getString(R.string.lost_guess_message)
                                        }
                                        showMessage = true
                                    }
                                    buttonsEnabled = true
                                    diceThrowed = nextdiceThrowed //Lo vemos
                                }.start()
                            },
                            enabled = dicePoints > 0 && buttonsEnabled, //habilitación boton (mas de 0 puntos y tiempo espera)
                            colors = ButtonDefaults.buttonColors(
                                containerColor = colorButtons,
                                contentColor = colorTxt2,
                                disabledContainerColor = colorButtonsDisabled
                            ),
                            shape = CircleShape,
                            modifier = Modifier
                                .shadow(4.dp, CircleShape)
                                .border(1.dp, Color.White, CircleShape)
                        ) {
                            Text(
                                text = "$i",
                                fontSize = dimensionResource(id = R.dimen.fontsize_medium).value.sp,
                                modifier = Modifier.padding(2.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(5.dp))
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))

                //FILA - BOTONES MAYOR Y MENOR
                //FILA DE MENSAJE SEPARADOR (informativo usuario)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    horizontalArrangement = Arrangement.Absolute.Center
                ) {
                    Text(
                        text = stringResource(R.string.explication_compare, diceThrowed)
                    )
                } //FIN FILA MENSAJE
                //FILA BOTONES MAYOR Y MENOR
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    horizontalArrangement = Arrangement.Absolute.Center
                ) {
                    Button(
                        onClick = {
                            //Estructura similar a anterior solo cambian los puntos
                            dicePoints -= 1
                            buttonsEnabled = false
                            messageDiceThrowing = messageStr1
                            Thread {
                                Thread.sleep(1000L)
                                nextdiceThrowed = dice.throwDice() //Se tira dado
                                messageDiceThrowing = ""

                                if (dicePoints <= 0) {
                                    dicePoints = 0
                                    messageDice = context.getString(R.string.no_points_message)
                                    showMessage = true
                                } else {
                                    //Se compara
                                    if (nextdiceThrowed > diceThrowed) {
                                        dicePoints += 3
                                        messageDice =
                                            context.getString(R.string.win_compare_message)
                                    } else {
                                        messageDice =
                                            context.getString(R.string.lost_compare_message)
                                    }
                                    showMessage = true
                                }
                                buttonsEnabled = true
                                diceThrowed = nextdiceThrowed //Lo vemos
                            }.start()
                        },
                        enabled = dicePoints > 0 && buttonsEnabled, //habilitación boton (mas de 0 puntos y tiempo espera)
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorButtons2,
                            contentColor = colorTxt2,
                            disabledContainerColor = colorButtonsDisabled
                        ),
                        shape = CircleShape,
                        modifier = Modifier
                            .shadow(8.dp, CircleShape)
                            .border(1.dp, Color.White, CircleShape)
                    ) {
                        Text(
                            text = "↑",
                            fontSize = dimensionResource(id = R.dimen.fontsize_medium).value.sp,
                            modifier = Modifier.padding(2.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            dicePoints -= 1
                            buttonsEnabled = false
                            messageDiceThrowing = messageStr1
                            Thread {
                                Thread.sleep(1000L)
                                nextdiceThrowed = dice.throwDice() //Se tira dado
                                messageDiceThrowing = ""
                                if (dicePoints <= 0) {
                                    dicePoints = 0
                                    messageDice = context.getString(R.string.no_points_message)
                                    showMessage = true
                                } else {
                                    //Se compara
                                    if (nextdiceThrowed < diceThrowed) {
                                        dicePoints += 3
                                        messageDice =
                                            context.getString(R.string.win_compare_message)
                                    } else {
                                        messageDice =
                                            context.getString(R.string.lost_compare_message)
                                    }
                                    showMessage = true
                                }
                                buttonsEnabled = true
                                diceThrowed = nextdiceThrowed //Lo vemos
                            }.start()
                        },
                        enabled = dicePoints > 0 && buttonsEnabled, //habilitación boton (mas de 0 puntos y tiempo espera)
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorButtons2,
                            contentColor = colorTxt2,
                            disabledContainerColor = colorButtonsDisabled
                        ),
                        shape = CircleShape,
                        modifier = Modifier
                            .shadow(8.dp, CircleShape)
                            .border(1.dp, Color.White, CircleShape)
                    ) {
                        Text(
                            text = "↓",
                            fontSize = dimensionResource(id = R.dimen.fontsize_medium).value.sp,
                            modifier = Modifier.padding(2.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                //Fin fila botones mayor o menor
                //Fila indicativa botones (info usuario)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Absolute.Center
                ) {
                    Text(
                        text = stringResource(R.string.major)
                    )
                    Spacer(modifier = Modifier.width(25.dp))
                    Text(
                        text = stringResource(R.string.minor)
                    )
                }
                //Fin fila indicativa
            }
            //FIN FILA JUEGO


            // Si startGame=false (por defecto) (pantalla inicial)
        } else {
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                //organizacion horizontal
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                //Boton play game
                Button(
                    onClick = {
                        startGame = true

                        //LANZAMIENTO INICIAL DEL DADO
                        buttonsEnabled = false
                        messageDiceThrowing = messageStr1
                        Thread {
                            Thread.sleep(1000L)  // 1 segundo
                            diceThrowed = dice.throwDice() // método de la clase Dice
                            messageDiceThrowing = ""
                            messageDice = ""
                            buttonsEnabled = true
                        }.start()
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorButtons2, contentColor = colorTxt2
                    ),
                    shape = CircleShape,
                    modifier = Modifier
                        .shadow(8.dp, CircleShape)
                        .border(1.dp, Color.White, CircleShape)
                ) {
                    Text(
                        text = stringResource(R.string.start_game),
                        fontSize = dimensionResource(id = R.dimen.fontsize_medium).value.sp,
                        modifier = Modifier.padding(2.dp)
                    )
                }
            }
        }
        //Común a todas las pantallas
        //FILA - NOMBRE
        Row(
            //organizacion horizontal
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.Absolute.Center,
            verticalAlignment = Alignment.Bottom

        ) {
            Text(
                text = "Ángela", fontSize = dimensionResource(id = R.dimen.fontsize_small).value.sp
            )
        } //FIN FILA NOMBRE
    }
}
