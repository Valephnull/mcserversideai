# mcserversideai

minecraft serverside fabric 1.21.4 mod where you can chat with the Gemini API, and it can call a command running tool to run commands.

## Roadmap

1. **Establish the Development Environment**
   - Install Java (JDK 17+ is recommended for Fabric).
   - Set up a new Fabric mod project targeting **Minecraft 1.21.4**. You can use the [Fabric example mod](https://github.com/FabricMC/fabric-example-mod) as a template.

2. **Initialize the Repository**
   - Create the standard Fabric project layout (`src/main/java`, `resources`, `build.gradle`, etc.).
   - Add a basic mod entry point class with `@ModInitializer` to bootstrap server-side logic.

3. **Integrate the Gemini API**
   - Decide how the server will communicate with the Gemini API (likely via HTTP requests).
   - Provide configuration options for the API key and settings.

4. **Implement Chat Handling**
   - Listen for chat events or commands like `/gemini <message>`.
   - Forward text to Gemini and display its response to the player.

5. **Create the Command Execution Tool**
   - Parse Gemini responses for commands and execute them through the server's command manager.
   - Sanitize and validate any commands before execution.

6. **Permissions and Safety**
   - Restrict who can interact with the mod and run commands.
   - Add timeouts or rate limits to prevent abuse.

7. **Packaging and Distribution**
   - Test the mod locally.
   - Package the compiled JAR and provide usage documentation.

This roadmap provides a starting point for turning this repository into the described mod.
