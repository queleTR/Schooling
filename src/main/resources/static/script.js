const stompClient = new StompJs.Client ({
    brokerURL: 'ws://127.0.0.1:8080/websocket',
});
stompClient.onConnect = (frame) => {
    console.log('Connected!')

    stompClient.subscribe('/messages', (message) => {
        const ulMessages = document.getElementById("messages")
        const liMessage = document.createElement("li")
        liMessage.innerText = message.body
        ulMessages.appendChild(liMessage)
    });
}
stompClient.activate();

function sendMessage() {
    const message = document.getElementById("msg").value
    stompClient.publish({
        destination: '/messages',
        body: message
    })
}