
function reverseSentence(sentence) {

    const words = sentence.split(" ");
    
    for (let i = 0; i < words.length; i++) {
        words[i] = reverseString(words[i]);
    }
    return words.join(" ");
}
function reverseString(str) {

    return str.split("").reverse().join("");
}

const input = "This is a sunny day";
const reversedSentence = reverseSentence(input);

console.log("Original sentence: " + input);
console.log("Reversed sentence: " + reversedSentence);
