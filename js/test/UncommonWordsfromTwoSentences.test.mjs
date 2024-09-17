import test from "node:test";
import { strict as assert } from "node:assert";
import uncommonFromSentences from "../src/UncommonWordsfromTwoSentences.mjs";


test("Uncommon Words from Two Sentences", async (t) => {
	await t.test("Case 1", () => {
	  assert.deepEqual(uncommonFromSentences("this apple is sweet", "this apple is sour"), ["sweet", "sour"]);
	});
	await t.test("Case 2", () => {
		assert.deepEqual(uncommonFromSentences("apple apple", "banana"), ["banana"]);
	});
  });
  
