<?php

include_once("Team.php");

function teamComp($a, $b) {
  if($a->getWinPercentage() == $b->getWinPercentage()) {
    return 0;
  } else {
    return ($a->getWinPercentage() < $b->getWinPercentage() ? 1 : -1);
  }
}

  $file_handle = fopen("mlb_nl_2011.txt", "r");

  $teams = array();

  //TODO: process the text file, creating teams and adding them to the array

  print "Teams: \n";
  foreach($teams as $team) {
    print $team . "\n";
  }

  usort($teams, "teamComp");

  print "\n\nSorted Teams: \n";
  foreach($teams as $team) {
    print $team . "\n";
  }

  //TODO: output the ordered teams to a file in a different format


?>