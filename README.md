# MiniShell

A simple Java-based shell/terminal emulator that provides basic file system operations.

## Overview

MiniShell is a command-line interface program that simulates basic shell functionality. It allows users to navigate and manipulate the file system through simple commands like `ls`, `cd`, `mkdir`, etc.

## Features

- Display current working directory
- List files and directories
- Change directories
- Create new directories
- Create new files
- Clear help information

## Commands

| Command | Description | Usage |
|---------|-------------|-------|
| `pwd` | Print working directory | `pwd` |
| `ls` | List files in current directory | `ls` |
| `cd` | Change directory | `cd [directory_name]` |
| `mkdir` | Create new directory | `mkdir [directory_name]` |
| `touch` | Create new file | `touch [file_name]` |
| `help` | Show help information | `help` |
| `exit` | Exit the program | `exit` |

## Project Structure

- `MiniShell.java`: Main class that handles user input and command parsing
- `ShellCommandHandler.java`: Class that implements the file system operations

## How to Compile and Run

```bash
# Compile
javac MiniShell.java ShellCommandHandler.java

# Run
java MiniShell
```

## Example Usage

```
Welcome to MiniShell! Type 'help' for a list of commands.
/home/user > pwd
/home/user
/home/user > mkdir test_dir
Directory created: test_dir
/home/user > cd test_dir
/home/user/test_dir > touch hello.txt
File created: hello.txt
/home/user/test_dir > ls
[FILE] hello.txt
/home/user/test_dir > cd ..
/home/user > exit
Exiting shell.
```
