# Test project for Portal with shadow-cljs

0. `npm i`

To use this with Calva:

1. Open the project in VS Code
2. Run: **Calva: Start Project REPL and Connect (aka Jack-in)**

The REPL should start and the Portal webview should appear.

## Works

There are taps in [test/main/server_test.clj](test/main/server_test.clj) and [test/main/core_test.cljs](test/main/core_test.cljs). Run the tests in the REPL and see the taps in Portal.


## Doesn't work

The taps for [test/main/core_test.cljs](test/main/core_test.cljs) doesn't happen for the `:test` shadow-cljs build, which runs the tests every time shadow reloads code.