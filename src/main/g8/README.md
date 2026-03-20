![Scala Version](https://img.shields.io/badge/Scala-$scala_version$-red)
![SBT Version](https://img.shields.io/badge/SBT-1.6.2-blueviolet)

## Overview
`$name$` is a Scala library published under `io.hiis`.

Its main package namespace is:

`io.hiis.lib.$package_name$`

Use this library to share reusable domain models, utility services, and cross-service contracts across your Scala applications.

## License
`$name$` is proprietary software owned by Hiis.

Use, copying, modification, and distribution are subject to the terms in the `LICENSE` file.

## Installation
Add the HIIS resolver and dependency in your application's `build.sbt`:

```scala
resolvers += "hiis-repository-releases" at "https://artifacts.hiis.io/releases"

libraryDependencies += "io.hiis" %% "$name$" % "<version>"
```

If you consume from a private repository instead of releases:

```scala
resolvers += "hiis-repository-private" at "https://artifacts.hiis.io/private"
```

## Repository Credentials
If the repository requires authentication, configure credentials using environment variables.

### Required environment variables
- `DEV_ID`
- `ARTIFACT_TOKEN`

### Windows (PowerShell)
```powershell
setx DEV_ID "<your-dev-id>"
setx ARTIFACT_TOKEN "<your-token>"
```

### macOS / Linux
```bash
export DEV_ID="<your-dev-id>"
export ARTIFACT_TOKEN="<your-token>"
```

After setting variables, restart your shell/IDE session.

## Basic Usage
Import classes from the base package:

```scala
import io.hiis.lib.$package_name$._
```

If your code is organized into subpackages (for example `models` and `services`), use explicit imports:

```scala
import io.hiis.lib.$package_name$.models._
import io.hiis.lib.$package_name$.services._
```

## Development
### Prerequisites
- JDK 21
- sbt 1.6.2+

### Common commands
```bash
sbt compile
sbt test
sbt scalafmtSbt scalafmtAll
sbt fix-lint
```

### Project layout
- `src/main/scala`: library source code
- `src/test/scala`: tests
- `project/plugins.sbt`: sbt plugins

## Publishing
This project publishes to HIIS artifacts infrastructure.

### Manual local publish
```bash
sbt publishLocal
```

### Remote publish
Set these environment variables before publishing:
- `VERSION` (example: `1.2.0`)
- `REPOSITORY` (`private`, `releases`, or `snapshots`)
- `DEV_ID`
- `ARTIFACT_TOKEN`

Then run:

```bash
sbt publish
```

## Versioning and Compatibility
- Versioning follows `early-semver`.
- Binary compatibility can be checked with MiMa (`mimaReportBinaryIssues`), using `PREVIOUS_VERSION` when needed.

## Troubleshooting
### Dependency not found
- Verify the resolver URL.
- Verify `DEV_ID` and `ARTIFACT_TOKEN`.
- Confirm the requested version exists.

### Authentication failures (401/403)
- Re-check token validity.
- Re-open terminal/IDE after updating env vars.

### Inconsistent formatting/lint failures
- Run `sbt fix-lint` and commit formatted output.



