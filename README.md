## guessing-game-javaFX

### A simple but interesting Fun Project made with JavaFX and Core Java. [Click here to get][1] the .jar file and use this line to execute this in command line 

```
example: java --module-path /home/saon/Desktop/Softwares/javafx-sdk-14.0.2.1/lib --add-modules javafx.controls,javafx.fxml -jar JavaFx.jar
````
Please, change these paths and values according to your PC setups.

If you are on Windows. You can convert this .jar file into .exe file by 
```
jpackage -t exe --name GuessingGame --description "It's a simple Guessing Game made with JavaFX. Author: Md. Saon Sikder, Computer Science & Engineering Dept., Faridpur Engineering College, Bangladesh" --app-version 1.0.0 --input /home/saon/Documents/Java/JavaFx/out/artifacts/JavaFx_jar --dest /home/saon/Music --icon /home/saon/Documents/Java/JavaFx/src/images --main-jar JavaFx.jar --module-path /home/saon/Desktop/Softwares/javafx-jmods-11.0.2 --add-modules javafx.controls,javafx.fxml --win-shortcut --win-menu
```
Please, change these paths and values according to your PC setups. And you've to download [jpackage and jmods][2] before.

### Here is some Sample Pictures about this Project. And you can also [watch a demo video][3] on "Youtube".

#### A simple UI for this Game. Player Name Box, Guess Number Box, Submit Button, Win-Lose number.
 - ![1](https://user-images.githubusercontent.com/57843701/111962947-2cfca780-8b1d-11eb-95ec-ea4c91f2f1b2.png)
#### You've to enter your name and a valid number. If your number is higher or lower then the secret number then you'll see some messages below to help you guess correctly.
 - ![2](https://user-images.githubusercontent.com/57843701/111962970-338b1f00-8b1d-11eb-9382-182ba4d0dec0.png)
#### After a Lose or Win your score will be updated automatically.
 - ![3](https://user-images.githubusercontent.com/57843701/111962986-384fd300-8b1d-11eb-9420-10d79e493996.png)



<!--Links-->
[1]:https://drive.google.com/file/d/1lJHX3Ny0Gj7vG2wBel_qK5XCPOpFimJD/view?usp=sharing
[2]:https://gluonhq.com/products/javafx/
[3]:https://youtu.be/4vu7qG3ZQDE
