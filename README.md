# Phalanx CI Fixer v2 — Java Testbed

Controlled failures in Java so the v2 agent can diagnose, fix, and close PRs end-to-end. Mirror of the Python / TS / JS testbeds but for the Java scorecard row.

- 5 languages × 4 failure classes = 20 scorecard cells. This repo covers the 4 Java cells.
- Each `failures/*.patch` introduces one class of CI failure when applied to `main`.
- CI runs Checkstyle (Lint job) and `mvn verify` with JaCoCo 80% gate (Test + Coverage job).

## Intentional failure patches

| Patch                     | Cell      | What it breaks                                                      |
| ------------------------- | --------- | ------------------------------------------------------------------- |
| `01-lint.patch`           | lint      | Checkstyle `LineLength` violation (>100 cols) in `MathOps.java`     |
| `02-test-assertion.patch` | test_fail | `multiply` returns `a + b` instead of `a * b`                       |
| `03-flake-sleep.patch`    | flake     | `Thread.sleep((long)(Math.random() * 3000))` inside a 2s Surefire timeout |
| `04-coverage-drop.patch`  | coverage  | Adds two untested helpers → JaCoCo line coverage under 80%          |

## Running locally

```bash
mvn -B checkstyle:check   # lint
mvn -B verify             # tests + JaCoCo coverage gate
```

JDK 21 required. Maven handles everything else.
