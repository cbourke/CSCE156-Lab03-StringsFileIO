<?php

  $file_handle = fopen("../data/H1N1nucleotide.txt", "r");

  $dna = "";
  while(!feof($file_handle)) {
    $line = fgets($file_handle);
    $dna .= trim($line);
  }
  fclose($file_handle);

  $subsequence = null;
  
  $count = 0;
  //TODO: write code to count the number of instances of the subsequence in the dna string



  print $subsequence . " appears " . $count . " times by direct inspection\n";

?>
