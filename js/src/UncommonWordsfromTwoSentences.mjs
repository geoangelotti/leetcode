/**
 * @param {string} s1
 * @param {string} s2
 * @return {string[]}
 */
var uncommonFromSentences = function (s1, s2) {
    const dictionary = new Map();
    s1.split(" ").filter(w => w.length > 0).forEach(w => {
        if (dictionary.has(w)) {
            const c = dictionary.get(w);
            dictionary.set(w, c + 1);
        } else {
            dictionary.set(w, 1);
        }
    });
    s2.split(" ").filter(w => w.length > 0).forEach(w => {
        if (dictionary.has(w)) {
            const c = dictionary.get(w);
            dictionary.set(w, c + 1);
        } else {
            dictionary.set(w, 1);
        }
    });
    return Array.from(dictionary.entries()).filter(([_, v]) => v === 1).map(([k, _]) => k);
};

export default uncommonFromSentences;