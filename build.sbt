
lazy val docSettings = Seq(
	apiURL := Some(url("file:///" + baseDirectory.value.getAbsolutePath + "/target/scala-2.12.0-RC2/api")),
	scalacOptions in (Compile, doc) ++= {
		Seq(
			"-sourcepath",
			baseDirectory.value.getAbsolutePath,
			"-doc-source-url",
			"https://github.com/jgreen-zynga/scaladoc-ex/tree/master/" + name.value + "/€{FILE_PATH}.scala"
		)
	},
	autoAPIMappings := true,
	scalaVersion := "2.12.0-RC2",
	scalaHome := Some(file("/Users/jgreen/opensource/scala/build/pack")),
	libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
)
lazy val `foo-lib` = (project in file("foo-lib")).
	settings(docSettings: _*)
	

lazy val `foo-app` = (project in file("foo-app")).
	dependsOn(`foo-lib`).
	settings(docSettings: _*)

