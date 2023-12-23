package uz.gita.melissastore.presentation.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.gita.melissastore.R
import uz.gita.melissastore.data.models.MenuItem
import uz.gita.melissastore.theme.BlackPanther
import uz.gita.melissastore.theme.LeadColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    onNavigationClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .padding(
                horizontal = 16.dp,
                vertical = 24.dp
            )
            .height(72.dp)
            .fillMaxWidth()
            .background(
                color = Color.White,
            )
            .clip(RoundedCornerShape(12.dp))
            .border(
                width = 0.1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        TopAppBar(
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = Color.White
            ),
            title = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(
                                vertical = 18.dp,
                                horizontal = 12.dp
                            )
                            .fillMaxHeight()
                    ) {
                        Text(
                            text = "Albert Flores",
                            style = TextStyle(
                                color = BlackPanther,
                                fontSize = 15.sp,
                                fontFamily = FontFamily(Font(R.font.sf_pro_text_medium)),
                                fontWeight = FontWeight.W500,
                                lineHeight = 24.sp
                            )
                        )

                        Text(
                            text = "Sotuvchi",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontFamily = FontFamily(Font(R.font.sf_pro_text_regular)),
                                fontWeight = FontWeight.W400
                            )
                        )
                    }


                    Image(
                        painter = painterResource(id = R.drawable.man4),
                        contentDescription = null,
                        modifier = Modifier
                            .size(56.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }
            },
            navigationIcon = {
                IconButton(
                    onClick = onNavigationClick,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier
                            .size(32.dp)
                    )
                }
            }
        )
    }
}

@Composable
fun DrawerHeader(){
    Row(
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp,
                top =16.dp,
                bottom = 36.dp
            ),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Melissa-store",
            style = TextStyle(
                color = LeadColor,
                fontSize = 21.sp,
                fontFamily = FontFamily(Font(R.font.sf_pro_text_regular)),
                fontWeight = FontWeight.W500
            )
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_close),
            contentDescription = "",
            modifier = Modifier
                .size(32.dp)
        )
    }
}

@Composable
fun DrawerBody(
    items:List<MenuItem>,
    onItemClick:(Int)->Unit
){
    LazyColumn {
        items(items){item->
            Row(
                modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
                    .clickable {
                        onItemClick.invoke(item.id)
                    }
            ) {
                Image(
                    painter = painterResource(id = item.icon),
                    contentDescription = "item icon",
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .size(32.dp)
                )

                Text(
                    text = item.title,
                    style = TextStyle(
                        color = BlackPanther,
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.sf_pro_text_medium)),
                        lineHeight = 24.sp
                    ),
                    modifier = Modifier
                        .padding(start = 16.dp)
                )
            }
        }
    }
}