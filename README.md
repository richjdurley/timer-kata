# Timer Kata

Implement a console based visual timer counting up in seconds using TimerCharacters provided.
 
### Acceptance Requirements
- Initially the timer should be displayed in the console using 6 zeros
- Press Key 's' to start the timer (in seconds)
- Every second refresh the timer display (incrementing the timer by 1)
- Press Key 's' to toggle starting and stopping the timer
- Press Key 'r' to reset the timer back to '000000' when the timer is stopped
- Press Key 'r' when the timer is started issues a bell (alert) sound

### Developer Rules
- Must use a strict TDD process
- Must not use abbreviations
- Must apply SOLID principles
- Must keep all objects small, highly cohesive and isolated
- Must use dependency inversion where appropriate
- Should use objects in preference to primitives
- Should use lamda programming style where appropriate

### Acceptance testing

- GIVEN a new TIMER
- WHEN `s` is pressed AND after 12 seconds when `s` is pressed again
- THEN the console display should now show
```

                              
                              
 .-.  .-.  .-.  .-.   .   .-. 
:   ::   ::   ::   :.'|  (   )
|   ||   ||   ||   |  |    .' 
:   ;:   ;:   ;:   ;  |   /   
 `-'  `-'  `-'  `-' '---''---'
                              
                              

```

- GIVEN a new TIMER
- WHEN `s` is pressed AND after 9 seconds WHEN `s` is pressed again and then `r` is pressed
- THEN the console display should now show
```

                              
                              
 .-.  .-.  .-.  .-.  .-.  .-. 
:   ::   ::   ::   ::   ::   :
|   ||   ||   ||   ||   ||   |
:   ;:   ;:   ;:   ;:   ;:   ;
 `-'  `-'  `-'  `-'  `-'  `-' 
                              
                              

```




