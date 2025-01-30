package com.example.tictactoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tictactoe.ui.theme.TicTacToeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TicTacToeTheme {
                TicTacToeGame()
            }
        }
    }
}

@Composable
fun TicTacToeGame() {
    var board by remember { mutableStateOf(Array(3) { arrayOfNulls<String>(3) }) }
    var currentPlayer by remember { mutableStateOf("X") }
    var winner by remember { mutableStateOf<String?>(null) }
    var isDraw by remember { mutableStateOf(false) }

    Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(
            text = "Tic Tac Toe",
            fontSize = 32.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        for (i in 0..2) {
            Row {
                for (j in 0..2) {
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .padding(4.dp)
                            .background(Color.LightGray, RoundedCornerShape(8.dp))
                            .clickable(enabled = board[i][j] == null && winner == null) {
                                if (board[i][j] == null) {
                                    board[i][j] = currentPlayer
                                    currentPlayer = if (currentPlayer == "X") "O" else "X"
                                    winner = checkWinner(board)
                                    if (winner == null && board.flatten().all { it != null }) {
                                        isDraw = true
                                    }
                                }
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = board[i][j] ?: "",
                            fontSize = 36.sp,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (winner != null || isDraw) {
            Text(
                text = when {
                    winner != null -> "Winner: $winner"
                    isDraw -> {
                        "It's a Draw!"
                    }
                    else -> ""
                },
                fontSize = 24.sp,
                color = Color.Green
            )
            Spacer(modifier = Modifier.run { height(16.dp) })
            Button(onClick = {
                board = Array(3) { arrayOfNulls<String>(3) }
                currentPlayer = "X"
                winner = null
                isDraw = false
            }) {
                Text(text = "Play Again")
            }
        } else {
            Text(
                text = "Current Player: $currentPlayer",
                fontSize = 20.sp
            )
        }
    }
}

fun checkWinner(board: Array<Array<String?>>): String? {
    // Check rows
    for (i in 0..2) {
        if (board[i][0] != null && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
            return board[i][0]
        }
    }

    // Check columns
    for (i in 0..2) {
        if (board[0][i] != null && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
            return board[0][i]
        }
    }

    // Check diagonals
    if (board[0][0] != null && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
        return board[0][0]
    }
    if (board[0][2] != null && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
        return board[0][2]
    }

    return null
}
