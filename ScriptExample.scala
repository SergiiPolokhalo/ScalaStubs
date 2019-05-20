#!/bin/sh
exec scala "$0" "$@"
!#
/**
  * Simple example of bash scripting in Scala
  * for use as bash script make command ''chmod +x ScriptExample.scala''
  */
object ScriptExample {
  //Not necessary, just for simplification call at the end of script
  def apply(args:Array[String]) = ScriptExample.main(args)
  def main(args:Array[String])={
    println(
      {
        args.zipWithIndex
          .map({ case (v, i) => s"Param#$i\t Value '$v'" })
          .mkString("\n")
      }
    )
  }
}
//Do not forger call main object!
ScriptExample(args)
