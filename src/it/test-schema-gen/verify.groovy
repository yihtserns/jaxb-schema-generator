def outputDir = new File(basedir, "target/classes");
assert outputDir.listFiles().find { it.name.endsWith('.xsd') } != null