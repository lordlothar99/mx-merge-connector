# Mendix "Merge connector" module

This module is a ready-to-use connector handling connection to [Merge](https://www.merge.dev/) from a Mendix app.

## Configuration
1. Read ["Getting started with Merge" guide](https://www.merge.dev/docs/)
2. ``GetOrNew_MergeConfiguration`` microflow has to be executed to create a ``MergeConfiguration`` object
3. ``Act_MergeLink`` nanoflow ahs to be executed in order to allow the user to execute Merge's link wizard, and get the ``account_token`` for their integration

## Notes
* A simple example can be found in ``_Use_me/Example`` folder
* It's recommended to configure Merge to ask for API key by default (fallback to username/password)
* Feel free to download the project from [Github](https://github.com/lordlothar99/mx-merge-connector), there's a runnable demo inside

## Dependencies
See ``userlib/merge.requiredlibs`` :
* Java : see [https://github.com/merge-api/merge-hris-java]
* Javascript : script ``initialize.js`` is included (downloaded from [https://cdn.merge.dev/initialize.js](https://cdn.merge.dev/initialize.js))

## Mendix version
9.2+
