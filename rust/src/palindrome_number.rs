#![allow(dead_code)]

fn is_palindrome(x: i32) -> bool {
    if x < 0 {
        return false;
    }
    let s = x.to_string();
    let s = s.as_bytes();
    for i in 0..s.len() / 2 {
        if s[i] != s[s.len() - 1 - i] {
            return false;
        }
    }
    true
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(121, true)]
    #[case(-121, false)]
    #[case(120, false)]
    fn test_is_palindrome(#[case] x: i32, #[case] expected: bool) {
        let result = is_palindrome(x);
        assert_eq!(result, expected);
    }
}
