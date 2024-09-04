#![allow(dead_code)]

fn count_even(num: i32) -> i32 {
    (2..=num)
        .filter(|i| {
            let (mut sum, mut x) = (0, *i);
            while x > 0 {
                sum += x % 10;
                x /= 10;
            }
            (sum & 1).eq(&0)
        })
        .count() as i32
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(4, 2)]
    #[case(30, 14)]
    fn test_count_even(#[case] num: i32, #[case] expected: i32) {
        let result = count_even(num);
        assert_eq!(result, expected);
    }
}
