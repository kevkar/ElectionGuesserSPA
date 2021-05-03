# ElectionGuesserSPA
Welcome to the election guesser! Look at a random county in the United States, its location, and some statistics to guess the results of the past three presidential elections. 

<img src="https://i.imgur.com/Sx1rhKE.png" width="650" height="650">

Click on "Graph" to see the result in graph form.

<img src="https://i.imgur.com/zUjA4p2.png" width="800" height="450">

<h2>Known issues and upcoming changes</h2>
<ul>
  <li>Alaska is missing! Alaska data is weird because its counties change often.</li>
  <li>Mobile does not look great.</li>
  <li>On rare occasions, it will mark your guess wrong when it's actually right. </li>
  <li>Guesses are sometimes too easy - randomizer needs improvement.</li>
</ul>  

<h2>Build Info</h2>
This single-page web app was made with a Java Spring Boot, MySQL, and Hibernate backend. Frontend in Thymeleaf and HTML/CSS/JavaScript. I cleaned the data with Python and Excel. Tested with JUnit, graphed in CanvasJS, hosted on heroku.

