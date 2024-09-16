#![allow(dead_code)]

fn find_min_difference(time_points: Vec<String>) -> i32 {
    let mut v = Vec::with_capacity(time_points.len() + 1);
    for s in time_points.iter() {
        v.push(s[..2].parse::<i32>().unwrap() * 60 + s[3..].parse::<i32>().unwrap());
    }
    v.sort_unstable();
    v.push(v[0] + 24 * 60);
    v.windows(2).map(|w| w[1] - w[0]).min().unwrap()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(vec!["23:59".to_string(), "00:00".to_string()], 1)]
    #[case(vec!["00:00".to_string(), "23:59".to_string(), "00:00".to_string()], 0)]
    fn test_find_min_difference(#[case] s: Vec<String>, #[case] expected: i32) {
        let result = find_min_difference(s);
        assert_eq!(result, expected);
    }
}
