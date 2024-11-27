document
  .getElementById("submit-command")
  .addEventListener("click", processCommand);

async function processCommand() {
  const input = document.getElementById("command-input");
  const output = document.getElementById("game-output");
  const command = input.value.trim();

  if (command === "") {
    return;
  }

  // Send the command to the backend
  const response = await fetch("http://localhost:8080/game", {
    method: "POST",
    body: command,
  });

  const responseText = await response.text();

  // Display the response
  const newOutput = document.createElement("p");
  newOutput.textContent = `> ${command}`;
  output.appendChild(newOutput);

  const responseOutput = document.createElement("p");
  responseOutput.textContent = responseText;
  responseOutput.style.color = "#61dafb";
  output.appendChild(responseOutput);

  output.scrollTop = output.scrollHeight;
  input.value = "";
}
