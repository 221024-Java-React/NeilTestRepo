document.getElementById("start-timer").addEventListener("click", start);
document.getElementById("stop-timer").addEventListener("click", stopTimer);

var myinterval;
var i = 0;

function timerDisplay(){
    document.getElementById("time").innerHTML = i;
    i++;
}

function start(){
    myinterval = setInterval(timerDisplay, 1000);
  }

  function stopTimer(){
    clearInterval(myinterval);
    document.getElementById("time").innerHTML = 0;
  }