# Test project for Portal with shadow-cljs

0. `npm i`

To use this with Calva:

1. Open the project in VS Code
2. Run: **Calva: Start Project REPL and Connect (aka Jack-in)**
    1. Select the project type: **shadow-portal**

The REPL should start and the Portal webview should appear.

## Works

There are taps in [test/main/server_test.clj](test/main/server_test.clj) and [test/main/core_test.cljs](test/main/core_test.cljs). Run the tests in the REPL and see the taps in Portal.


## Doesn't work

The taps for [test/main/core_test.cljs](test/main/core_test.cljs) doesn't happen for the `:test` shadow-cljs build, which runs the tests every time shadow reloads code.

## Portal setup code

The code for starting Portal and open the webview is in [env/dev/portal/setup.clj](env/dev/portal/setup.clj), this is started as part of the REPL connection from [.vscode/settings.json](.vscode/settings.json)

The code for adding the ClojureScript tap is in [env/dev/portal/setup.cljs](env/dev/portal/setup.cljs). It is loaded by shadow-cljs from [shadow-cljs.edn](shadow-cljs.edn). (Where it is configured both for the `:app` and the `:test` builds.)