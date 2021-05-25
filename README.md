# ElectionGuesser Single-page Application
Welcome to the election guesser! Look at a random county in the United States, its location, and some statistics to guess the results of the past three presidential elections. Check it out <a href="https://www.electionguesser.com/" target="_blank">here!</a>

<img src="https://i.imgur.com/Sx1rhKE.png" width="650" height="650">

Click on "Graph" to see the result in graph form.

<img src="https://i.imgur.com/zUjA4p2.png" width="800" height="450">

<h2>Known issues and upcoming changes</h2>
<ul>
  <li>Alaska is missing! Alaska data is weird because its counties change often.</li>
  <li>Mobile does not look great.</li>
  <li>Guesses are sometimes too easy - randomizer needs improvement.</li>
</ul>  

<h2>Build Info</h2>
This single-page web app was made with a Java Spring Boot, MySQL, and Hibernate backend. Frontend in Thymeleaf and HTML/CSS/JavaScript. I cleaned the data with Python and Excel. Dependency management with Maven, tested with JUnit, graphed in CanvasJS, and hosted on heroku.

<h2>Sources</h2>

Data for 2008-2016 elections from the <a href="https://dataverse.harvard.edu/dataset.xhtml?persistentId=doi:10.7910/DVN/VOQCHQ" target="_blank">MIT Election Data + Science Lab</a>
<br>
Data for 2020 election from <a href="https://github.com/tonmcg/US_County_Level_Election_Results_08-20" target="_blank">github</a> 
<br>
Images from Wikipedia using the <a href="https://chrome.google.com/webstore/detail/download-all-images/nnffbdeachhbpfapjklmpnmjcgamcdmm" target="_blank">Download All Images tool</a> 
