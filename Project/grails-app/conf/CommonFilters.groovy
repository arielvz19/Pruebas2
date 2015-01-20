
class CommonFilters {
	
	def filters = {
        trimSpaces(controller: '*', action: '*') {
            before = {
				convertBlanksToNullsAndTrim(params)
            }
        }
				
    }

	private static void convertBlanksToNullsAndTrim(Map map) {
		def keys = []+ map.keySet() // copy to avoid
		//ConcurrentModificationException
		for (name in keys) {
			def value = map[name]
			if (value instanceof String) {
				value = value.trim()
				if (value.length() == 0) {
					map[name] = null // don't remove - explicity set to null
				}
				else {
					map[name] = value // update if trimmed
				}
			}
			else if (value instanceof Map) {
				// recurse with empty nested param, e.g., "location":["id":""]
				convertBlanksToNullsAndTrim value
			}
		}

	}
}
