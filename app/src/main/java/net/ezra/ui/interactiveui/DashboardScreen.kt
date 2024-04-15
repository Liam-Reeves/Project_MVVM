package net.ezra.ui.interactiveui

import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_INTERACTIVE_UI
import net.ezra.ui.home.HomeScreen

@Composable
fun DashboardScreen(navController: NavHostController) {
    LazyColumn {
        item {
            Column(modifier = Modifier
                .background(Color(0xffF1ED9C))
                .fillMaxSize(),

                ) {
                TopBar(name ="DASHBOARD")

                Card1(
                   name = "Total Unit in Stock",
                   digit ="786",
                    digit2 ="$565,430.00" ,
                    name2 = "Total Inventory Value")


                
     


            }
        }
    }



}
@Composable
fun TopBar(
    name :String,
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xffF1ED9C))
    ) {
        Text(text = name,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            color = Color.Black

        )

        Icon(imageVector = Icons.Default.Notifications,
            contentDescription ="Bell",
            tint = Color.Blue,
            modifier = Modifier.size(26.dp)
            )

    }

}
@Composable
fun Card1(
        name: String,
        digit : String,
        digit2 : String,
        name2 : String,

) {
    Row {
        Card(
            colors = CardDefaults.cardColors(Color(0xff2589BE)),
            elevation = CardDefaults.cardElevation(5.dp),
            modifier = Modifier
                .size(200.dp)
                .padding(
                    start = 5.dp,
                    top = 5.dp,
                    end = 5.dp,
                    bottom = 5.dp
                )


        ) {
            Icon(imageVector = Icons.Default.LocationOn,
                contentDescription ="null",
                tint = Color.Blue,
                modifier = Modifier.size(26.dp)
            )

            Row {
                Text(
                    text = digit,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier.padding(20.dp)

                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                Text(
                    text = name,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White,
                )
            }


        }
        Spacer(modifier = Modifier.width(40.dp))
        Card(
            colors = CardDefaults.cardColors(Color(0xFFFFFFFF)),
            elevation = CardDefaults.cardElevation(5.dp),
            modifier = Modifier
                .size(200.dp)
                .padding(
                    start = 5.dp,
                    top = 5.dp,
                    end = 5.dp,
                    bottom = 5.dp
                )

        ) {
            Icon(imageVector = Icons.Default.ShoppingCart,
                contentDescription ="null",
                tint = Color.Blue,
                modifier = Modifier.size(26.dp)
            )
            Row {
                Text(
                    text = digit2,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(20.dp)

                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                Text(
                    text = name2,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Black,
                )

            }

        }


    }



}





























@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun DashboardScreenPreviewLight() {
    DashboardScreen(rememberNavController())
}

