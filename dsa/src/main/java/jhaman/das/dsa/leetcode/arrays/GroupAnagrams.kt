package jhaman.das.dsa.leetcode.arrays


fun main() {
    println(groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat")).joinToString(","))

}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val res: HashMap<String, MutableList<String>> = hashMapOf()

    for (localString in strs) {
        val count = IntArray(26)
        for (str in localString) {
            val index = str - 'a'
            count[index] += 1
        }
        res[count.joinToString()] = res.getOrDefault(count.joinToString(),
            mutableListOf()).also { it.add(localString) }
    }

    return res.values.toList()
}

