/**
 * @param {string} s1
 * @param {string} s2
 * @return {string[]}
 */
var uncommonFromSentences = function (s1, s2) {
    const dictionary = new Map();
    populateDictionary(s1, dictionary);
    populateDictionary(s2, dictionary);
    return Array.from(dictionary.entries()).filter(([_, v]) => v === 1).map(([k, _]) => k);
};

/**
 * @param {string} s
 * @param {Map<string, number>} dictionary
 */
var populateDictionary = function (s, dictionary) {
    s.split(" ").filter(w => w.length > 0).forEach(w => {
        if (dictionary.has(w)) {
            const c = dictionary.get(w);
            dictionary.set(w, c + 1);
        } else {
            dictionary.set(w, 1);
        }
    });
}

export default uncommonFromSentences;