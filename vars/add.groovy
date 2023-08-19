def call(a, b) {
    def result = a.toInteger() + b.toInteger()
    echo "The sum of ${a} and ${b} is ${result}"
}
