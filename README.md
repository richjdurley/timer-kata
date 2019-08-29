# Timer Kata

Implement a visual timer counting up in seconds printed to the console system output.

A starter project has been provided
 
### Acceptance Requirements
- Initially the timer should be displayed in the console using 6 zeros
- Press Key `<SPACEBAR>` to start the timer (in seconds)
- Every second refresh the timer display (showing an incremented timer by 1)
- Press Key `<SPACEBAR>` to toggle starting and stopping the timer
- Press Key r to reset the timer back to '000000' when the timer is stopped
- Pressing Key r when the timer is started issues a bell (alert) sound

### Developer Rules
- Must use a strict TDD process
- Must not use abbreviations
- Must apply SOLID principles & Model View Controller pattern
- Must keep all objects small, highly cohesive and isolated
- Must use dependency inversion where appropriate
- Should use objects in preference to primitives
- Should use lamda programming style where appropriate

### Acceptance testing

- GIVEN a new TIMER 
- WHEN `<SPACEBAR>` is pressed AND after 12 seconds when `<SPACEBAR>` is pressed again
- THEN the console display should now show
```
  ___    ___    ___    ___   _  ____  
 / _ \  / _ \  / _ \  / _ \ / ||___ \ 
| | | || | | || | | || | | || |  __) |
| |_| || |_| || |_| || |_| || | / __/ 
 \___/  \___/  \___/  \___/ |_||_____|
```

- GIVEN a new TIMER
- WHEN `<SPACEBAR>` is pressed AND after 9 seconds WHEN `<SPACEBAR>` is pressed again and then `r` is pressed
- THEN the console display should now show
```
  ___    ___    ___    ___    ___    ___  
 / _ \  / _ \  / _ \  / _ \  / _ \  / _ \ 
| | | || | | || | | || | | || | | || | | |
| |_| || |_| || |_| || |_| || |_| || |_| |
 \___/  \___/  \___/  \___/  \___/  \___/                        
```

### Architecture
The senior architect on this project has given a start and proposed the following architecture.
This project also uses FigletFont to generate the banners, it is called from BannerView.class.

![Architecture](./architecture.png?raw=true "Architecture Strawman")




