import serve from "C:/Program Files/Mendix/9.2.0.20531/modeler/tools/node/node_modules/rollup-plugin-serve";
import nodeResolve from "C:/Program Files/Mendix/9.2.0.20531/modeler/tools/node/node_modules/@rollup/plugin-node-resolve";
import commonjs from "C:/Program Files/Mendix/9.2.0.20531/modeler/tools/node/node_modules/@rollup/plugin-commonjs";
import clear from "C:/Program Files/Mendix/9.2.0.20531/modeler/tools/node/node_modules/rollup-plugin-clear";
import esbuild from "C:/Program Files/Mendix/9.2.0.20531/modeler/tools/node/node_modules/rollup-plugin-esbuild";
import livereload from "C:/Program Files/Mendix/9.2.0.20531/modeler/tools/node/node_modules/rollup-plugin-livereload";
import alias from "C:/Program Files/Mendix/9.2.0.20531/modeler/tools/node/node_modules/@rollup/plugin-alias";

export default {
    input: "index.js",
    watch: {
        clearScreen: false,
    },
    output: {
        dir: "dist",
        format: "es",
        chunkFileNames: "[name].js",
        sourcemap: true,
        // manualChunks(id) {
        //   if (id.includes("node_modules")) {
        //     return "commons";
        //   }
        // },
    },
    treeshake: {
        moduleSideEffects: false,
    },
    plugins: [
        esbuild({
            // All options are optional
            sourceMap: true, // default
            exclude: [],
            minify: process.env.NODE_ENV === "production",
            // Like @rollup/plugin-replace
            define: {
                "process.env.NODE_ENV": JSON.stringify("development"),
            },
            loaders: {
                // Enable JSX in .js files too
                ".js": "jsx",
            },
        }),
        alias({
            entries: {
                react: "C:/Program Files/Mendix/9.2.0.20531/modeler/tools/node/node_modules/react",
                "big.js": "C:/Program Files/Mendix/9.2.0.20531/modeler/tools/node/node_modules/big.js",
                "mendix-web": "C:/Program Files/Mendix/9.2.0.20531/modeler/tools/node/node_modules/mendix-web",
            },
            customResolver: nodeResolve(),
        }),
        nodeResolve(),
        commonjs(),
        serve({
            open: true,
            contentBase: ["", "public"],
            host: "localhost",
            port: 3000,
        }),
        clear({
            targets: ["dist"],
            watch: true,
        }),
        livereload({ watch: "dist" }),
    ],
};
