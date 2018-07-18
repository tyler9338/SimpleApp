# SimpleApp

## Description
The app is created in Android Studio

### Buttons on top

App simplly display texts when click different buttons
When "Show Left Name" button is clicked, the app will display Toast message: “Port (left) is red”, and log the same message into LogCat.
"Show Right Name" button will do the same thing but message is “Starboard (right) is green.”.

### Buttons on bottom

"Means Left” (on left), and “Means Right” (right) are bottons in the bottom

Clicks one of the buttons indicate the game’s currently chosen side is left or right.

If the user selects the correct answer then the app will:
  1. Display a toast message “Correct!”
  2. Display a LogCat message: “User guess of Port was Correct!” (or Starboard)
  3. Pick a new random side (port or starboard) for the next round of the game.
If the user selects the incorrect answer then:
  1. Display a toast message “Incorrect. :(”
  2. Display a LogCat message: “User guess of Port was Incorrect.” (or Starboard) 
  3. Pick a new random side (port or starboard) for the next round of the game.
