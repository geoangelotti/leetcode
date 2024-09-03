#![allow(dead_code)]
fn get_lucky(s: String, k: i32) -> i32 {
    let mut s = s
        .chars()
        .map(|c| (c as u8 - b'a' + 1).to_string())
        .collect::<Vec<String>>()
        .join("");
    for _ in 0..k {
        s = s
            .chars()
            .map(|c| c as i32 - '0' as i32)
            .sum::<i32>()
            .to_string();
    }
    s.parse::<i32>().unwrap()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case("iiii", 1, 36)]
    #[case("leetcode", 2, 6)]
    #[case("zbax", 2, 8)]
    fn test_get_lucky(#[case] s: String, #[case] k: i32, #[case] expected: i32) {
        let result = get_lucky(s, k);
        assert_eq!(result, expected);
    }
}
