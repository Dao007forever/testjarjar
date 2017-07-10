scalaVersion := "2.11.8"

assemblyShadeRules in assembly := Seq(
  ShadeRule.rename("com.abc.**" -> "com.aaa.@1").inAll
)
