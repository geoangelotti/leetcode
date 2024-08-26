const test = require("node:test");
const assert = require("node:assert/strict");
const expect = require("../src/ToBeOrNotToBe");

test("", (t) => {
  assert.strictEqual(expect(5).toBe(5), true);
});

test("", (t) => {
  assert.throws(() => expect(5).toBe(null), {
    name: "Error",
    message: "Not Equal",
  });
});

test("", (t) => {
  assert.strictEqual(expect(5).notToBe(null), true);
});
