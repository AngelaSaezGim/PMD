package com.angelasaez.statisticsangela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelasaez.statisticsangela.ui.theme.StatisticsAngelaTheme
import kotlin.random.Random

/*
Para cambiar el color de un botón se puede usar la clase Color, bien indicando una de sus propiedades 
preestablecidas para color, o bien con su constructor pasando el valor hexadecimal (alpha, rojo, verde, azul).
Un color se puede almacenar en una variable si se quiere reutilizar.

Se debe añadir un botón en la parte inferior de la aplicación con el texto "Randomize" que al 
pulsarlo ponga un número aleatorio de 0 a 10 en cada uno de los 4 contadores (personas, patinetes, bicicletas y coches).
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StatisticsAngelaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Content(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun Content(modifier: Modifier = Modifier) {

    // Saveable - para que cuando cambie configuración no se cambie
    var totalTimesAll by rememberSaveable { mutableIntStateOf(0) }
    var totalPersons by rememberSaveable { mutableIntStateOf(0) }
    var totalScooters by rememberSaveable { mutableIntStateOf(0) }
    var totalBykes by rememberSaveable { mutableIntStateOf(0) }
    var totalCars by rememberSaveable { mutableIntStateOf(0) }

    //Randomizador
    var randomN = Random.nextInt(0, 11)

    //cambiar el color del texto

    //buttons sizes
    val myButtonsSize = 10.dp
    val myButtonsSizeSmall = 5.dp
    //que mi columna ocupe todo y que coga el margen original
    Column(
        //organizacion vertical
        modifier = Modifier
            .fillMaxSize()
            .then(modifier),
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        //FILA
        Row(
            //organizacion horizontal
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.Absolute.Right
        ) {
            Text(
                text = "Estadísticas Angela", fontSize = 20.sp
            )
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "TOTAL : $totalTimesAll", fontSize = 20.sp, color = Color.Red
                )
            }
        } //FIN FILA
        Spacer(modifier = Modifier.height(5.dp))
        //FILA
        Row(
            modifier = Modifier.fillMaxWidth(), // Ocupa todo el ancho disponible
            horizontalArrangement = Arrangement.Center // Centra horizontalmente
        ) {
            Button(
                onClick = {
                    // Acción del botón
                    totalPersons = randomN
                    totalScooters = randomN
                    totalBykes = randomN
                    totalCars = randomN
                    totalTimesAll = totalPersons + totalScooters + totalBykes + totalCars
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF7D3C98), // Color del contenedor (fondo del botón)
                    contentColor = Color.White // Color del texto (contenido del botón)
                )
            ) {
                Text(
                    text = "RANDOMIZE !", fontSize = 20.sp, modifier = Modifier.padding(10.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        //FILA
        Row(
            //organizacion horizontal
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Absolute.Center
        ) {
            Button(
                onClick = {
                    totalTimesAll = 0
                    totalPersons = 0
                    totalScooters = 0
                    totalBykes = 0
                    totalCars = 0
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF4A235A), // Color del contenedor (fondo del botón)
                    contentColor = Color.White // Color del texto (contenido del botón)
                )
            ) {
                Text(
                    text = "RESET ALL", fontSize = 20.sp, modifier = Modifier.padding(10.dp)
                )
            }
        }// FIN FILA
        Spacer(modifier = Modifier.height(20.dp))
        Row( // 3 FILA - Personas
            //organizacion horizontal
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Absolute.Left
        ) {
            Text(
                text = "Personas;   ", fontSize = 20.sp, modifier = Modifier.padding(myButtonsSize)
            )
            Button( //SUMA PERSONAS
                onClick = {
                    totalPersons++
                    totalTimesAll++
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFA569BD), // Color del contenedor (fondo del botón)
                    contentColor = Color.Green // Color del texto (contenido del botón)
                )
            ) {
                Text(
                    text = "+", fontSize = 15.sp, modifier = Modifier.padding(myButtonsSizeSmall)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button( //RESTAR PERSONAS
                onClick = {
                    totalPersons--
                    if (totalPersons <= 0) {
                        totalPersons = 0
                    }
                    totalTimesAll--
                    if (totalTimesAll <= 0) {
                        totalTimesAll = 0
                    }//
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFA569BD), contentColor = Color.Blue
                )
            ) {
                Text(
                    text = "-",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(myButtonsSizeSmall - 2.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button( //RESET PERSONAS
                onClick = {
                    totalTimesAll -= totalPersons
                    totalPersons = 0
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5B2C6F), contentColor = Color.White
                )
            ) {
                Text(
                    text = "Reset",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(myButtonsSizeSmall)
                )
            }
        }
        // FIN 3 FILA
        //4 FILA - Patinetes
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            //organizacion horizontal
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Absolute.Left
        ) {
            Text(
                text = "Patinetes;   ", fontSize = 20.sp, modifier = Modifier.padding(myButtonsSize)
            )
            Button(
                onClick = { //SUMAR PATINETES
                    totalTimesAll++
                    totalScooters++
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFA569BD), contentColor = Color.Green //
                )
            ) {
                Text(
                    text = "+", fontSize = 15.sp, modifier = Modifier.padding(myButtonsSizeSmall)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = {
                    //RESTAR PATINETES
                    totalScooters--
                    if (totalScooters <= 0) {
                        totalScooters = 0
                    }
                    totalTimesAll--
                    if (totalTimesAll < 0) {
                        totalTimesAll = 0
                    }
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFA569BD), contentColor = Color.Blue
                )

            ) {
                Text(
                    text = "-",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(myButtonsSizeSmall - 2.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            //RESET Patinetes
            Button(
                onClick = {
                    //resetear patinetes
                    totalTimesAll -= totalScooters
                    totalScooters = 0
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5B2C6F), contentColor = Color.White
                )
            ) {
                Text(
                    text = "Reset",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(myButtonsSizeSmall)
                )
            }
        } //FIN 4 FILA
        //5 FILA
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            //organizacion horizontal
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Absolute.Left
        ) {
            Text(
                text = "Bicicletas;  ", fontSize = 20.sp, modifier = Modifier.padding(myButtonsSize)
            )
            Button(
                onClick = {
                    //SUMAR BICIS
                    totalTimesAll++
                    totalBykes++
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFA569BD), contentColor = Color.Green //
                )


            ) {
                Text(
                    text = "+", fontSize = 15.sp, modifier = Modifier.padding(myButtonsSizeSmall)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            //RESTAR BICIS
            Button(
                onClick = {
                    totalTimesAll--
                    totalBykes--
                    if (totalBykes <= 0) {
                        totalBykes = 0
                    }
                    if (totalTimesAll <= 0) {
                        totalTimesAll = 0
                    }
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFA569BD), contentColor = Color.Blue
                )


            ) {
                Text(
                    text = "-",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(myButtonsSizeSmall - 2.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = {
                    //RESETEAR BICIS
                    totalTimesAll -= totalBykes
                    totalBykes = 0
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5B2C6F), contentColor = Color.White
                )

            ) {
                Text(
                    text = "Reset",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(myButtonsSizeSmall)
                )
            }
        } //FIN 5 FILA
        //6 FILA - Coches
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            //organizacion horizontal
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Absolute.Left
        ) {
            Text(
                text = "Coches;      ", fontSize = 20.sp, modifier = Modifier.padding(myButtonsSize)
            )
            //SUMAR COCGES
            Button(
                onClick = {
                    totalTimesAll++
                    totalCars++
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFA569BD), contentColor = Color.Green //
                )


            ) {
                Text(
                    text = "+", fontSize = 15.sp, modifier = Modifier.padding(myButtonsSizeSmall)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = {
                    //RESTAR COCHES
                    totalTimesAll--
                    totalCars--
                    if (totalCars <= 0) {
                        totalCars = 0
                    }
                    if (totalTimesAll <= 0) {
                        totalTimesAll = 0
                    }
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFA569BD), contentColor = Color.Blue
                )


            ) {
                Text(
                    text = "-",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(myButtonsSizeSmall - 2.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Boton
            Button(
                onClick = {
                    //RESETEAR COCHES
                    totalTimesAll -= totalCars
                    totalCars = 0
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5B2C6F), contentColor = Color.White
                )
            ) {
                Text(
                    text = "Reset",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(myButtonsSizeSmall)
                )
            }
        } //FIN 6 FILA
        Spacer(modifier = Modifier.height(100.dp))
        Column(
            modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                //No se puede dividir entre 0 - hacer if
                text = "PERSONAS : $totalPersons --- ${(totalPersons * 100) / (if (totalTimesAll == 0) 1 else totalTimesAll)} %",
                fontSize = 20.sp, color = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "PATINETES : $totalScooters --- ${(totalScooters * 100) / (if (totalTimesAll == 0) 1 else totalTimesAll)} %",
                fontSize = 20.sp, color = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "BICICLETAS : $totalBykes --- ${(totalBykes * 100) / (if (totalTimesAll == 0) 1 else totalTimesAll)} %",
                fontSize = 20.sp, color = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "COCHES : $totalCars ---  ${(totalCars * 100) / (if (totalTimesAll == 0) 1 else totalTimesAll)} %",
                fontSize = 20.sp, color = Color.Blue
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
    }
}