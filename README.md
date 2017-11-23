# ETOS
ETOS, for Ecore TO Scala, is an [Acceleo](https://www.eclipse.org/acceleo/) project that generates Scala code from an Ecore model. More specifically, it relies on the `.genmodel` file.

# Current features
ETOS is currently able to generate:
- classes,
- traits,
- fields,
- methods.

It also handles inheritance and ScalaDoc.

# Not stable!
Since the work is still in progress, the project will change in the near future.

# Use
Once `etos` has been installed into Eclipse IDE (see below), merely right-click on the `.genmodel` file, select the `Acceleo Model to Text` menu item, then `Generate Ecore to Scala`. 

The generated Scala files should be in the `src-gen` folder.

# Installation
As of now, no update site is available to download etos directly from Eclipse IDE. However, thanks to Maven, you can easily build your one.

## Prerequisite
Maven 3 must be available in the system. It can be download from [maven.apache.org](https://maven.apache.org/download.cgi).

## Generate an update site
First, clone this repository:
```
git clone https://github.com/KazeJiyu/etos
```

Then launch Maven:
```
mvn install
```

`etos`' update site should have been generated in `releng/fr.kazejiyu.etos.pim.ecore.gen.scala.updatesite/target/repository`.

## Install etos into Eclipse IDE
From Eclipse IDE, go to `Help` > `Install New Software...`.

Click `Add...` > `Local`.

Select `/path/to/etos/releng/fr.kazejiyu.etos.pim.ecore.gen.scala.updatesite/target/repository`.

Check the runtime and IDE features, then click to `Finish`.

