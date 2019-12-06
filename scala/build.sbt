enablePlugins(ScalaJSPlugin)

name := "ScalaJS for PDF"
scalaVersion := "2.12.6" // or any other Scala version >= 2.10.2


// This is an application with a main method
mainClass in Compile := Some("Main")
scalaJSUseMainModuleInitializer := true

skip in packageJSDependencies := false

