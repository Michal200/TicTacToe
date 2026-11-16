# 🎮 TicTacToe – Modern Android Game

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9+-7F52FF.svg?style=flat&logo=kotlin&logoColor=white)](https://kotlinlang.org)
[![Android](https://img.shields.io/badge/Platform-Android_14+_(API_35)-3DDC84.svg?style=flat&logo=android&logoColor=white)](https://developer.android.com)
[![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack_Compose-4285F4.svg?style=flat&logo=jetpackcompose&logoColor=white)](https://developer.android.com/jetpack/compose)
[![Material 3](https://img.shields.io/badge/Material_Design-3-795548.svg?style=flat)](https://m3.material.io)

A clean, modern, and reactive **Tic-Tac-Toe** game for Android built entirely with **Kotlin** and **Jetpack Compose**. The project showcases declarative UI development, unidirectional state management using Compose runtime primitives, and modern Android development standards.

---

## ✨ Features

- **Declarative UI**: Built 100% with Jetpack Compose composables, eliminating traditional XML layouts.
- **Reactive State Management**: Uses `remember` and `mutableStateOf` for instant, flicker-free UI updates.
- **Dynamic Turn Indicators**: Real-time display showing current turn (`X` vs `O`).
- **Automated Win & Draw Detection**: Instant evaluation of rows, columns, and diagonals upon every move.
- **Material 3 Design**: Clean rounded tiles, subtle elevation, and responsive typography conforming to Material 3 standards.
- **Quick Restart**: Instant "Play Again" reset state without reloading activity lifecycles.

---

## 🛠 Tech Stack & Architecture

- **Language**: [Kotlin](https://kotlinlang.org/)
- **UI Toolkit**: [Jetpack Compose](https://developer.android.com/jetpack/compose) (Compose BOM)
- **Design System**: [Material 3 (M3)](https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary)
- **Build System**: Gradle with Kotlin DSL (`build.gradle.kts`)
- **Min SDK**: 24 (Android 7.0 Nougat) | **Target & Compile SDK**: 35 (Android 14 / 15)

---

## 📂 Project Structure

```
app/src/main/
├── AndroidManifest.xml
├── java/com/example/tictactoe/
│   ├── MainActivity.kt          # Main composables, board state & game logic
│   └── ui/theme/
│       ├── Color.kt             # Material 3 color definitions
│       ├── Theme.kt             # TicTacToeTheme & dynamic color setup
│       └── Type.kt              # Typography styles
└── res/                         # App icons, xml configurations & themes
```

---

## 🚀 Getting Started

### Prerequisites
- **Android Studio** (Hedgehog | Iguana | Koala | Ladybug or newer)
- **JDK 11** or higher
- Android SDK with Platform 35 installed

### Installation & Run
1. **Clone the repository:**
   ```bash
   git clone https://github.com/Michal200/TicTacToe.git
   cd TicTacToe
   ```
2. **Open in Android Studio:** Select "Open an Existing Project" and choose the cloned folder.
3. **Build the project:** Let Gradle sync all dependencies.
4. **Run:** Select an emulator or connected physical Android device and click **Run (Shift + F10)**.

---

## 👩‍💻 Author

**Michal Grinboim**  
- **GitHub**: [@Michal200](https://github.com/Michal200)  
- **LinkedIn**: [Michal Weisz Grinboim](https://linkedin.com/in/michal-weisz-96231a2a0)  
- **Email**: michalweisz360@gmail.com
