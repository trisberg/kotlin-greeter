package functions

import java.util.function.Function

class Greeter : Function<String, String> {
	override fun apply(name: String) = "Hello $name"
}
