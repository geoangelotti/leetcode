/**
 * @param {string[]} tokens
 * @return {number}
 */
var evalRPN = function (tokens) {
	const stack = [];
	tokens.forEach((token) => {
		const num = Number(token);
		if (!isNaN(num)) {
			stack.push(num);
		} else {
			const m1 = stack.pop();
			const m2 = stack.pop();
			switch (token) {
				case '+':
					stack.push(m2 + m1);
					break;
				case '-':
					stack.push(m2 - m1);
					break;
				case '*':
					stack.push(m2 * m1);
					break;
				case '/':
					stack.push(Math.trunc(m2 / m1));
					break;
			}
		}
	});
	return stack.pop()
};

export default evalRPN;