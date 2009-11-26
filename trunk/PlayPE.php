<?php

// php / 的结果是浮点数，要用floor舍去法才能到商。

function ex1(){	
  // "Add all the natural numbers below one thousand that are multiples of 3 or 5."
  // "自然数1000以下的由3和5乘得。（答案:233168）
  // 第一种解法，很自然想到整除
  $a=0;
  for ($i=0;$i<1000;$i++){
    if (( $i % 3 == 0 ) or ( $i % 5 == 0 )){
       $a += $i;
    }
  }
  echo $a;
  echo "\n";
  // 第二种解法，观察3,6,9,12,15....998,999 相当于(1+2+3+4+5+...+333)X3
  // 观察5,10,15,20,25 相当于(1+2+3+4+5+...+198+199)X5,凡是15的倍数就被重复了。
  // 求和3 求和5，然后再减去15
  
  function c3($num){
    $b=999;
    $p = floor($b / $num);
    $x=(1+$p)*$p/2*$num;
    return $x;
  }
  echo c3(3)+c3(5)-c3(15);
}   

ex1();

?>
