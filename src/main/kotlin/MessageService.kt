abstract class MessageService {
    open fun sendMsg(sender: String, receiver: String, msg: String){
        println("Message \"$msg\" sent by $sender to $receiver")
    }
}