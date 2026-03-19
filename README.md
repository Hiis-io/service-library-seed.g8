![Scala Version](https://img.shields.io/badge/Scala-2.13.8-red)
![SBT Version](https://img.shields.io/badge/SBT-1.6.2-blueviolet)
![Scala CI](https://github.com/hiis-io/gallery-service-library/actions/workflows/scala.yml/badge.svg)
![Release](https://img.shields.io/badge/Release-v0.0.1-blue)

## Giter8 Template
This repository is a giter8 template.

Generate a new project with:

```bash
sbt new hiis-io/service-library-seed.g8
```

You will be prompted for:

1. `project_name`
2. `scala_version`
3. `package_name`

The generated base package path is:

`io.hiis.lib.<package_name>`

## Intro
Some intro

## Usage
Follow the steps bellow to add the library to your scala application.


1. Add `sbt-github-packages` plugin to enable sbt to consume the package
      
      Add this line to your `./project/plugins.sbt`

      `addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.3")`
  
    
2. Add library resolver and dependencies to `./build.sbt`

      ```
         githubTokenSource := TokenSource.Environment("PACKAGE_TOKEN")

         resolvers += Resolver.githubPackages("hiis-io")

         libraryDependencies += "io.hiis" %% "<library name>" % "<version>"
      ```

3. Create a GitHub token from GitHub with permissions `(repo and package)`
      Create and copy a GitHub token with permissions `repo and package` then create an Environment variable called `GITHUB_TOKEN` on your computer which has as value to token generated from GitHub.
      
      - On Windows Command prompt(cmd) run `setx PACKAGE_TOKEN <token_from_github>`

      - On Mac or Linux go to `~/.profile` and add the line `export GITHUB_TOKEN=<token_from_github>`
   
      - Restart your computer else your IDE might not detect the new env variables

     
## Development
The development of this library should be aligned with its parent service <parent service Github repository>



