# Hunger Games Simulator

A Java-based simulator for the Hunger Games, where users can create, simulate, and visualize a Hunger Games scenario with customizable characters and events.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Configuration](#configuration)
- [Contributing](#contributing)
- [Tests](#tests)
- [License](#license)
- [Contact Information](#contact-information)
- [Acknowledgments](#acknowledgments)

## Introduction

The Hunger Games Simulator is a project that simulates the events of the Hunger Games. Users can create characters, define attributes, and simulate interactions in a Hunger Games setting. The simulator randomly generates events and outcomes, providing an engaging and unpredictable experience.

## Features

- Create and customize characters with different attributes.
- Simulate a full Hunger Games scenario.
- Randomly generated events and outcomes.
- Visual representation of the game's progress.
- Configurable game settings for custom simulations.

## Installation

To set up the Hunger Games Simulator locally, follow these steps:

1. **Clone the repository:**
    ```bash
    git clone https://github.com/JayZA80/Hunger-Games-Sim.git
    ```

2. **Navigate to the project directory:**
    ```bash
    cd hunger-games-simulator
    ```

3. **Compile the Java files:**
    ```bash
    javac -d bin src/com/hungergames/*.java
    ```

4. **Run the simulator:**
    ```bash
    java -cp bin com.hungergames.Main
    ```

## Usage

Once the simulator is running, you can:

1. **Create Characters:** Input names and attributes for each character.
2. **Start Simulation:** Begin the simulation and watch as events unfold.
3. **View Results:** Analyze the outcome and see which character emerges victorious.

### Example

```bash
# Create a character
Name: Katniss Everdeen
Strength: 8
Agility: 7
Intelligence: 6

# Start Simulation
Day 1: Katniss finds water.
Day 2: Katniss encounters a wild animal and survives.
...

# View Results
Winner: Katniss Everdeen
