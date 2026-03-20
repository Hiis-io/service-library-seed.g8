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

If the template repository is private, you can also generate using a Git URL.

Using SSH:

```bash
sbt new git@github.com:Hiis-io/service-library-seed.g8.git
```

Using HTTPS:

```bash
sbt new https://github.com/Hiis-io/service-library-seed.g8.git
```

You can also pass values inline:

```bash
sbt new hiis-io/service-library-seed.g8 --name=my-lib --scala_version=2.13.16 --package_name=orders
```

You will be prompted for:

1. `name`
2. `scala_version`
3. `package_name`

The generated base package path is:

`io.hiis.lib.<package_name>`

## Maintainers
Template sources are stored in `src/main/g8` (giter8 src layout).

- Edit template files under `src/main/g8/**`.
- Define prompts/defaults in `src/main/g8/default.properties`.
- SBT project template files are under `src/main/g8/$sbt_project_dir$/` and render to `project/` in generated projects.
- `sbt_project_dir` is an internal template variable; users should not override it.



