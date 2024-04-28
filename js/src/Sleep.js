/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
	return new Promise((res)=>(setTimeout(res, millis)));
}

module.exports = sleep;