# Sieve

Sieve contains comparable implementations of the [Sieve of Eratosthenes] in
various programming languages:

- Python
- Java

To build the Sieve source code in any of the provided languages, [clone] this
repository and [activate Hermit] in your terminal.

    . ./bin/activate-hermit
    python sieve.py
    javac sieve.java && java SieveOfEratosthenes

<details>
  <summary>Hermit automatically installs tools.</summary>

### Hermit

The tools used in this repository, such as Python are
automatically downloaded by [Hermit] when needed. Hermit ensures that
developers on Mac, Linux, and GitHub Actions CI use the same version of
the same tools. Cloning this repo is the only installation step
necessary.

There are two ways to use the tools in the Evy repository. You can
either prefix them with `bin/`, for example `bin/python3 sieve.py`. Or, you can
activate Hermit in your shell with

    . ./bin/activate-hermit

This will add the tools to your path, so you can use them without having
to prefix them with `bin/`.

You can auto-activate Hermit when changing into the `evy` source
directory by installing [Hermit shell hooks] with

    hermit shell-hooks

</details>

[Clone]: https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository
[activate Hermit]: https://cashapp.github.io/hermit/usage/get-started/?h=activating#activating-an-environment
[Hermit]: https://cashapp.github.io/hermit
[Hermit shell hooks]: https://cashapp.github.io/hermit/usage/shell/#shell-hooks
[Sieve of Eratosthenes]: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
