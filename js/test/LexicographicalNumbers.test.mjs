import test from "node:test";
import { strict as assert } from "node:assert";
import lexicalOrder from "../src/LexicographicalNumbers.mjs";

test("Return all the numbers in the range [1, n] sorted in lexicographical order", async (t) => {
  await t.test("One", () => {
    assert.deepEqual(
      lexicalOrder(13),
      [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9]
    );
  });

  await t.test("Three", () => {
    assert.deepEqual(lexicalOrder(2), [1, 2]);
  });
});
