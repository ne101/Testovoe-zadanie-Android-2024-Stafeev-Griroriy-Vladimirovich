package fourthTask

interface Subscriber {
    fun update(news: String)
}

class NewsPoster {
    private val subscribers = mutableListOf<Subscriber>()

    fun subscribe(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    fun unsubscribe(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }

    fun postNews(news: String) {
        for (subscriber in subscribers) {
            subscriber.update(news)
        }
    }
}

class NewsReader(private val nameReader: String) : Subscriber {
    override fun update(news: String) {
        println("$nameReader Получил новости: $news")
    }
}

fun main() {
    val newsPoster = NewsPoster()
    val reader1 = NewsReader("Антон")
    val reader2 = NewsReader("Дима")

    newsPoster.subscribe(reader1)
    newsPoster.subscribe(reader2)

    newsPoster.postNews("Новость дня: В Египте выпал снег!")

    newsPoster.unsubscribe(reader1)

    newsPoster.postNews("Новость дня: На Урале растаял снег!")
}
